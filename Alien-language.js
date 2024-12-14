process.stdin.resume();
process.stdin.setEncoding("utf-8");
var stdin_input = "";
 
process.stdin.on("data", function (input) {
    stdin_input += input;
});
 
process.stdin.on("end", function () {
   main(stdin_input);
});
 
function isYes(text, pattern) {
    text = text.toLowerCase();
    pattern = pattern.toLowerCase();
    
    const scannedSet = new Set([])
    for(let i=0;i<pattern.length;i++) {
        if (!scannedSet.has(pattern[i])) {
            if (text.includes(pattern[i])) {
                return true;
            }
            scannedSet.add(pattern[i])
        }
    }
    return false;
}
 
function solve(data) {
    const T = parseInt(data[0]);
 
    for (let i= 0; i < T ;i++) {
        const text = data[i*2+1];
        const pattern = data[i*2+2];
        console.log(isYes(text, pattern) ? "YES" : "NO");
    }
}
 
function main(input) {
    const data = input.split("\n");
    solve(data)
}
