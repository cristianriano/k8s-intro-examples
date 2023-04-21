# K8S Examples

All the examples were run on Minikube

## Set Up

You need to install minikube to run this demo and a driver.

1. `brew install minikube` (This will also install `kubectl`. Formulae: kubernetes-cli)
2. Install the `hyperkit` driver with brew (complete list of available drivers [here](https://minikube.sigs.k8s.io/docs/drivers/)):
3. Start minikube `minikube start --driver=hyperkit --cpus 4 --memory 8192`
4. To access services from outside the cluster open another terminal window and run `minikube tunnel`
5. When done stop/destroy the cluster `minikube delete --all` or `minikube stop`

## Helm

1. Install helm with brew
2. Add the repository url. This add the Bitnami repo that has many examples.
(For more repos check [Artifact Hub](https://artifacthub.io/))
`helm repo add bitnami https://charts.bitnami.com/bitnami`
3. Search for the desired chart with
`helm search repo redis`
4. Get more info on the desired repo
`helm show all [chart]`
5. Check the available values to configure
`helm show values [chart] > values.yml`
6. Finally install the desired chart
`helm install [name] [chart]`

## Challenge!

- Dockerize a basic Spring Application (one available in [spring-app](./spring-app/))
- Deploy it on K8S with a Deployment using Minikube
- Expose it as a Service
- Install MySQL using Helm Chart and connect from the app
- BONUS: Deploy MySQL and the app in different namespace (tip: Check NetworkPolicy component for Ingress and Egress)
- BONUS 2: Configure a persistent volume to persist MySQL data

### Solution

1. Install MySQL with custom values `helm install mysql-service bitnami/mysql --values values-mysql-override.yml`

## Resources

Apply the desired example with
`kubectl apply -f resources/<file>`