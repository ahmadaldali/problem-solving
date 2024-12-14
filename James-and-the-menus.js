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
   const [n, m] = data[0].split(' ');
    const N = parseInt(n); // menus
    const M = parseInt(m); // items
 
    const menus = data.slice(1).map(line => line.split(' ').map(Number));
    const maxPrices = new Array(M).fill(0);
    const menusHaveMax = new Array(M).fill(null).map(() => []);
 
    for (let menu = 0; menu < n; menu++) {
        for (let item = 0; item < m; item++) {
            const price = menus[menu][item];
            if (price > maxPrices[item]) {
                maxPrices[item] = price;
                menusHaveMax[item] = [menu];
            } else if (price === maxPrices[item]) {
                menusHaveMax[item].push(menu);
            }
        }
    }
 
    const goodCounts = new Array(N).fill(0);
    for (let item = 0; item < M; item++) {
        for (const menu of menusHaveMax[item]) {
            goodCounts[menu]++;
        }
    }
    
    let mostUpdatedMenu = 0;
    let maxCount = 0;
    let maxPrice = 0;
 
    for (let j = 0; j < n; j++) {
        const priceOfMenu = menus[j].reduce((sum, cur) => sum + cur, 0);
        if (goodCounts[j] > maxCount || 
           (goodCounts[j] === maxCount && priceOfMenu > maxPrice)) {
            maxCount = goodCounts[j];
            maxPrice = priceOfMenu;
            mostUpdatedMenu = j + 1;
        }
    }
 
    console.log(mostUpdatedMenu);
}
 
function main(input) {
    const data = input.split('\n').filter(line => line.trim() !== '');
    solve(data);
}
