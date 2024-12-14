process.stdin.resume();
process.stdin.setEncoding("utf-8");
var stdin_input = "";
 
process.stdin.on("data", function (input) {
    stdin_input += input;
});
 
process.stdin.on("end", function () {
   main(stdin_input);
});
 
function maxValue(arr) {
    return arr.length > 0 ? arr.reduce((max, val) => {
        return (max > val) ? max : val;
    }) : -1n;
}
 
function solve(data) {
    const [N, K] = data[0].split(" ").map(BigInt);
    const A = data[1].split(" ").map(element => BigInt(element));
 
    let result = -1n;
    let max = -1n;
 
    if (K > N) {
        result = N == 1 && K%BigInt(2) == 1 ? -1n : maxValue(A);
    } else {
        const K_1Index = Number(K - 1n)
        max = maxValue(A.slice(0, K_1Index));
        result = N == K ? max : (A[K_1Index+1] > max ? A[K_1Index+1] : max);
    }
 
    console.log(result.toString());
}
 
function main(input) {
    const data = input.split("\n");
    solve(data);
}
