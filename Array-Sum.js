process.stdin.resume();
process.stdin.setEncoding("utf-8");
var stdin_input = "";
 
process.stdin.on("data", function (input) {
    stdin_input += input;
});
 
process.stdin.on("end", function () {
   main(stdin_input);
});
 
function solve(data) {
    const A = data[1].split(" ");
 
    const result = A.reduce((sum, element) => {
        return sum += BigInt(element);
    }, BigInt(0))
 
    console.log(result.toString())
}
 
function main(input) {
    const data = input.split("\n");
    solve(data)
}
