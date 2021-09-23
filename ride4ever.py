from sys import argv;

FOLDERS_NAMES_PREFIX = [
    "ride4ever-microservice-",
    "ride4ever-service-"
];

def is_run_process(arguments):
    if (len(arguments) == 2):
        if (arguments[1] in ["-r", "--run"]):
            return True;
    return False;

def is_install_process(arguments):
    if (len(arguments) == 2):
        if (arguments[1] in ["-i", "--install"]):
            return True;
    return False;

def main(arguments: list):
    if (is_install_process(arguments)):
        print("Installation")
        pass
    elif (is_run_process(arguments)):
        print("Running!")
        pass
    return 0;

if (__name__ == "__main__"):
    main(argv);