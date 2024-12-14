process.stdin.resume();
process.stdin.setEncoding("utf-8");
var stdin_input = "";
 
process.stdin.on("data", function (input) {
    stdin_input += input;                               // Reading input from STDIN
});
 
process.stdin.on("end", function () {
   main(stdin_input);
});
 
function solve(s){
    return s.split("").map((c) => c = c.charCodeAt(0) >= 97 ? c.toUpperCase() : c.toLowerCase()).join("");
}
 
function main(input) {
    const data = input.split("\n");
    const S = data[0];
 
    console.log(solve(S));
}
