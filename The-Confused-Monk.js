process.stdin.resume();
process.stdin.setEncoding("utf-8");
var stdin_input = "";
 
process.stdin.on("data", function (input) {
    stdin_input += input;
});
 
process.stdin.on("end", function () {
   main(stdin_input);
});
 
function gcd(a, b) {
  if (!b) {
    return a;
  }
 
  return gcd(b, a % b);
}
 
function solve(data) {
    const N = parseInt(data[0]);
    const A = data[1].split(" ").map(Number);
    const MonkQuotient = BigInt(Math.pow(10,9) + 7)
 
    const gcdValue = BigInt(A.reduce((acc, curr) => gcd(acc, curr)));
 
    let result=BigInt(1);
    
 
    for (let i=0; i < N; i++) {
        result *= (BigInt(A[i]) ** gcdValue) % MonkQuotient
    }
 
    console.log((result % (MonkQuotient)).toString())
}
 
function main(input) {
    const data = input.split("\n");
    solve(data)
}
