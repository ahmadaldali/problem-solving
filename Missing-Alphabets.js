process.stdin.resume();
process.stdin.setEncoding("utf-8");
var stdin_input = "";
 
process.stdin.on("data", function (input) {
    stdin_input += input;
});
 
process.stdin.on("end", function () {
   main(stdin_input);
});
 
function isABeforeThanB(alphabetaMap, a,b) {
    for(let i=0;i<a.length;i++) {
        if (a[i] == b[i]) continue;
        
        const aiIndex = alphabetaMap.get(a[i]) ?? -1;
        const biIndex = alphabetaMap.get(b[i]) ?? -1;
        
        return aiIndex < biIndex;
    }
    
    return true;
}
 
function solveTestCase(alphabeta, S) {
    let alphabetaMap = new Map([]);
    alphabeta.split("").map((char, index) => alphabetaMap.set(char, index));
 
    S.sort(function(a, b) {
        return isABeforeThanB(alphabetaMap, a,b) ? -1 : 1;
    });
 
    console.log(S.join('\n'))
}
 
function solve(data) {
    let line = 0;;
    const T = parseInt(data[line]);
    line++;
    for (let i= 1; i <= T ;i++) {
       const alphabeta = data[line];
       line++;
       const M = parseInt(data[line]);
       line++;
       const S = []
       for(let j=1;j<=M;j++) {
        S.push(data[line])
        line++;
       }
       solveTestCase(alphabeta, S);
    }
}
 
function main(input) {
    const data = input.split("\n");
    solve(data)
}
