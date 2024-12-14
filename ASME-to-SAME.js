process.stdin.resume();
process.stdin.setEncoding("utf-8");
var stdin_input = "";
 
process.stdin.on("data", function (input) {
    stdin_input += input;
});
 
process.stdin.on("end", function () {
   main(stdin_input);
});
 
function isConvertible(N, s, t) {
    let sArray = s.split('');
    let sMap = new Map();
 
    for (let char of sArray) {
        sMap.set(char, (sMap.get(char) || 0) + 1);
    }
 
    for (let i = 0; i < N; i++) {
        const currentChar = t.charAt(i);
        if (sMap.has(currentChar) && sMap.get(currentChar) > 0) {
            sMap.set(currentChar, sMap.get(currentChar) - 1);
        } else {
            if (sMap.has('?') && sMap.get('?') > 0) {
                sMap.set('?', sMap.get('?') - 1);
            } else {
                return false;
            }
        }
    }
    
    return Array.from(sMap.values()).every(count => count === 0);
}
 
function solve(data) {
    const T = parseInt(data[0]);
 
    for (let i= 0; i < T ;i++) {
        const N = parseInt(data[i*3+1]);
        const s = data[i*3+2];
        const t = data[i*3+3];
        console.log(isConvertible(N,s,t) ? "Yes" : "No");
    }
}
 
function main(input) {
    const data = input.split("\n");
    solve(data)
}
