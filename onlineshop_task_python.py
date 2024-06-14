class Item:
    def __init__(self, name, price):
        self.name = name
        self.price = price

    def display(self):
        return f"{self.name} (€{self.price})"

class Transaction:
    def __init__(self, client, items, transaction_number):
        self.client = client
        self.items = items
        self.transaction_number = transaction_number

    def display(self):
        return f"Transaction {self.transaction_number}: {', '.join(item.display() for item in self.items)}"


class Client:
    def __init__(self, name):
        self.name = name
        self.transactions = []
        self.next_transaction_number = 1

    def add_transaction(self, items):
        transaction = Transaction(self, items, self.next_transaction_number)
        self.transactions.append(transaction)
        self.next_transaction_number += 1

    def display(self):
        return f"Customer: {self.name}"

# Create items
item1 = Item("Applepie", 10)
item2 = Item("Pudding", 5)
item3 = Item("Chocolate box", 8)
item4 = Item("Honey cake", 15)

# Create clients
client1 = Client("Lucas")
client2 = Client("Liina")
client3 = Client("Yoko")

# Add transactions to clients
client1.add_transaction([item1, item3])
client1.add_transaction([item2])
client2.add_transaction([item3, item2])
client2.add_transaction([item4])
client3.add_transaction([item1, item2, item3])

# Print all clients, transactions, and items
clients = [client1, client2, client3]
print("[ My cake shop transaction data for each customer ]\n" )
for client in clients:
    print(client.display())
    for transaction in client.transactions:
        print("  ", transaction.display())
