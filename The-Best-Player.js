process.stdin.resume();
process.stdin.setEncoding("utf-8");
var stdin_input = "";
 
process.stdin.on("data", function (input) {
    stdin_input += input;
});
 
process.stdin.on("end", function () {
   main(stdin_input);
});
 
function addOrUpdate(map, key, value) {
    if (map.has(key)) {
        const existingValue = map.get(key);
        // Check if the new value is better (lower for this example)
        if (value < existingValue) {
            map.set(key, value); // Update with a better value
        }
    } else {
        map.set(key, value);
    }
 
    return map;
}
 
function solve(data) {
    const [T,N] = data[0].split(" ");
    let input = [];
 
    for (let i=1;i<=T;i++) {
        const [N, F] = data[i].split(" ");
        input.push({'key': N, 'value': BigInt(F)});
    }
 
    input = input.sort((a, b) => {
        if (a.value === b.value) {
            return a.key.localeCompare(b.key); // If values are equal, sort by keys
        }
        return (a.value < b.value) ? 1 : -1; // Sort by values
    });
 
    const results = Array.from(input).slice(0, N);
    results.forEach(result => console.log(result.key));
 
}
 
function main(input) {
    const data = input.split("\n");
    solve(data)
}
