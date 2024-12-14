process.stdin.resume();
process.stdin.setEncoding("utf-8");
var stdin_input = "";
 
process.stdin.on("data", function (input) {
    stdin_input += input;
});
 
process.stdin.on("end", function () {
   main(stdin_input);
});
 
const MOD = 10n ** 9n + 7n;
 
function solveTestCase(n, k) {
    let result = 1n;
 
    for (let j = 0; j < n; j++) {
        result = (result * BigInt(k - j)) % MOD;
    }
 
    console.log(result.toString().trim(""));
}
 
function solve(data) {
    const T = parseInt(data[0]);
    for (let i=1;i<=T;i++) {
        [N, K] = data[i].split(" ");
        solveTestCase(N,K)
    }
}
 
function main(input) {
    const data = input.split("\n");
    solve(data)
}
