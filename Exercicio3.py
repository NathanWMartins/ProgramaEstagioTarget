import json

with open('faturamento.json', 'r') as file:
    faturamento_mensal = json.load(file)

menor_valor = float('inf')
maior_valor = float('-inf')
soma_faturamento = 0
dias_com_faturamento = 0

for faturamento in faturamento_mensal:
    valor = faturamento['valor']
    if valor > 0:
        if valor < menor_valor:
            menor_valor = valor
        if valor > maior_valor:
            maior_valor = valor
        soma_faturamento += valor
        dias_com_faturamento += 1

media_mensal = soma_faturamento / dias_com_faturamento

dias_acima_da_media = sum(1 for faturamento in faturamento_mensal if faturamento['valor'] > media_mensal)

print(f"Menor valor de faturamento em um dia do mês: {menor_valor}")
print(f"Maior valor de faturamento em um dia do mês: {maior_valor}")
print(f"Número de dias com faturamento acima da média: {dias_acima_da_media}")
