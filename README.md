# K8S Examples

All the examples were run on Minikube

## Set Up

You need to install minikube to run this demo and a driver.

1. `brew install minikube` (This will also install `kubectl`. Formulae: kubernetes-cli)
2. Install the `hyperkit` driver with brew (complete list of available drivers [here](https://minikube.sigs.k8s.io/docs/drivers/)):
3. Start minikube `minikube start --driver=hyperkit --cpus 4 --memory 8192`
4. To access services from outside the cluster open another terminal window and run `minikube tunnel`
5. When done stop/destroy the cluster `minikube delete --all` or `minikube stop`

## Resources

Apply the desired example with
`kubectl apply -f resources/<file>`