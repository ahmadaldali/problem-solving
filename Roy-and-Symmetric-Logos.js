process.stdin.resume();
process.stdin.setEncoding("utf-8");
var stdin_input = "";
 
process.stdin.on("data", function (input) {
    stdin_input += input;
});
 
process.stdin.on("end", function () {
   main(stdin_input);
});
 
function solveTestCase(N, logoArr) {
    // no need to scan the entire array.
 
    // check the top left with the corresponding sides
    for(let r=0;r<parseInt(N/2);r++) {
        for(let c=0;c<parseInt(N/2);c++) {
            if (logoArr[r][c] != logoArr[N-1-r][c] || logoArr[r][c] != logoArr[r][N-1-c])
                return false;
        }
    }
 
    // check the bottom right with the corresponding sides
    for(let r=parseInt(N/2);r<N;r++) {
    for(let c=parseInt(N/2);c<N;c++) {
            if (logoArr[r][c] != logoArr[N-1-r][c] || logoArr[r][c] != logoArr[r][N-1-c])
                return false;
        }
    }
 
    return true;
}
 
function solve(data) {
    const T = parseInt(data[0]);
 
    let line = 0;
    for (let i= 0; i < T ;i++) {
        line++;
        const N = parseInt(data[line]);
        const logoArr = [];
        for (let j=1;j<=N;j++) {
            line++;
            logoArr.push(data[line].split(""))
        }
 
        console.log(solveTestCase(N, logoArr) ? "YES" : "NO");
    }
}
 
function main(input) {
    const data = input.split("\n");
    solve(data)
}
