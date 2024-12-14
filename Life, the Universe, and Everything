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
    const index = data.findIndex((item) => item === "42");
	for (let i=0; i< index; i++) {
		console.log(data[i]);
	}
}
 
function main(input) {
    const data = input.split("\n");
    solve(data)
}
