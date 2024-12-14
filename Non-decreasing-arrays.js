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
    const T = parseInt(data[0]);
    for (let i= 0; i < T ;i++) {
        const N = parseInt(data[i*2+1]);
        const A = data[i*2+2].split(" ");
 
        let result = A[0];
        let lastB = BigInt(parseInt(A[0]));
        for (let j= 1; j<N ;j++) {
            const Ai = BigInt(A[j]);
            if (Ai >= lastB) {
                lastB = Ai;
            } else {
                lastB = BigInt(Math.ceil(Number(lastB) / Number(Ai))) * Ai;
            }
 
            result = result + " " + lastB.toString()
        }
 
        console.log(result);
    }
 
 
}
 
function main(input) {
    const data = input.split("\n");
    solve(data)
}
