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
    const [X,Y,S,T] = data[0].split(" ").map((el) => Number(el));
 
    let result = 0;
	for (let i=X;i<=X+S;i++)
		for (let j=Y;j<=Y+S;j++)
			if (i+j <= T) {
				result++;
			}	
 
	console.log(result);
}
 
function main(input) {
    const data = input.split("\n");
    solve(data)
}
