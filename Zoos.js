process.stdin.resume();
process.stdin.setEncoding("utf-8");
var stdin_input = "";
 
process.stdin.on("data", function (input) {
    stdin_input += input;                               // Reading input from STDIN
});
 
process.stdin.on("end", function () {
   main(stdin_input);
});
 
function solve(data) {
    const numberOfZ = data[0].indexOf("o");
    console.log((data[0].length - numberOfZ) === (numberOfZ * 2) ? "Yes" : "No")
}
 
function main(input) {
    const data = input.split("\n");
    solve(data)
}
