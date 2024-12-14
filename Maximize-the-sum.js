process.stdin.resume();
process.stdin.setEncoding("utf-8");
var stdin_input = "";
 
process.stdin.on("data", function (input) {
    stdin_input += input;
});
 
process.stdin.on("end", function () {
   main(stdin_input);
});
 
function solveTestCase(N,K,A) {
 
    const resultMap = A.reduce((acc, num) => {
        if (num >= 0) {
            if (!acc.has(num)) {
                acc.set(num, { sum: num });
            } else {
                const entry = acc.get(num);
                entry.sum += num;
            }
        }
        return acc;
    }, new Map());
 
    const sortedEntries = Array.from(resultMap.entries()).sort((a, b) => {
        return a[1].sum - b[1].sum;
    });
 
    const lastKEntries = sortedEntries.slice(-K);
    
    const finalSum = lastKEntries.reduce((total, entry) => {
        return total + BigInt(entry[1].sum);
    }, BigInt(0));
 
    console.log(finalSum.toString());
}
 
function solve(data) {
    const T = parseInt(data[0]);
 
    for (let i=0; i<T;i++) {
        const [N, K] = data[i*2+1].split(" ");
        const A = data[i*2+2].split(" ").map((el) => Number(el));
        solveTestCase(N,K,A);
    }
}
 
function main(input) {
    const data = input.split("\n");
    solve(data)
}
