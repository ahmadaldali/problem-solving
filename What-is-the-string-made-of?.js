process.stdin.resume();
process.stdin.setEncoding("utf-8");
var stdin_input = "";
 
process.stdin.on("data", function (input) {
    stdin_input += input;
});
 
process.stdin.on("end", function () {
   main(stdin_input);
});
 
const dahses = new Map([
  ["0", 6],
  ["1", 2],
  ["2", 5],
  ["3", 5],
  ["4", 4],
  ["5", 5],
  ["6", 6],
  ["7", 3],
  ["8", 7],
  ["9", 6],
]);
 
function solve(data) {
    const S = data[0].split("");
    const result = S.reduce((sum, currentChar) => {
        return sum + dahses.get(currentChar)
    }, 0)
    console.log(result);
}
 
function main(input) {
    const data = input.split("\n");
    solve(data)
}
