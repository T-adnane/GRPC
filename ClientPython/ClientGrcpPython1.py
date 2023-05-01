import grpc
import Bank_pb2 as Bank_pb2
import Bank_pb2_grpc as Bank_pb2_grpc

def run():
    channel = grpc.insecure_channel('localhost:5555')
    stub = Bank_pb2_grpc.BankServiceStub(channel)

    # convert method
    response = stub.convert(Bank_pb2.ConvertCurrencyRequest(
        currencyFrom='USD',
        currencyTo='EUR',
        amount=100
    ))
    print("Convert response: " + str(response))

    # getCurrencyStream method
    for response in stub.getCurrencyStream(Bank_pb2.ConvertCurrencyRequest(
            currencyFrom='USD',
            currencyTo='EUR',
            amount=100
    )):
        print("Currency stream response: " + str(response))

    # performStream method
    requests = [
        Bank_pb2.ConvertCurrencyRequest(amount=10),
        Bank_pb2.ConvertCurrencyRequest(amount=20),
        Bank_pb2.ConvertCurrencyRequest(amount=30),
        Bank_pb2.ConvertCurrencyRequest(amount=40),
    ]
    response = stub.performStream(iter(requests))
    print("Perform stream response: " + str(response))

    # fullCurrencyStream method
    requests = [
        Bank_pb2.ConvertCurrencyRequest(amount=10),
        Bank_pb2.ConvertCurrencyRequest(amount=20),
        Bank_pb2.ConvertCurrencyRequest(amount=30),
        Bank_pb2.ConvertCurrencyRequest(amount=40),
    ]
    responses = stub.fullCurrencyStream(iter(requests))
    for response in responses:
        print("Full currency stream response: " + str(response))

if __name__ == '__main__':
    run()
