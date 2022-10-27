# JBoss EAP Pet Store Microservices Application Deployed to Azure App Service (AAS)
## Description 
In this sample app template of the Pet Store Microservices application. Each of the Application Microservices are containerized and deployed to an Azure App Service (AAS) secured by Azure Firewall

## Deploy JBoss EAP Applicaiton to Azure App Services:

--
Tech stack:

- Azure Infra (Hub & Spoke Toppology)
- Azure Infra (VNet Peering)
- Azure User Defined Routing (UDR)
- Azure Application Inisghts
- Azure Log Analytics
- Azure Application Gateway
- Azure Fire Wall
- Azure Bastion
- Azure App Service (AAS)
- Azure PostgreSQL DB
- Github Actions
- Bicep
- Docker
- Maven

---

## Introduction

This is a quickstart template. It deploys the following:

* Deploying Pet Store App:
  * Progres SQL Database configuration
  * Provisioning Azure Infra Services with BICEP
  * Create the Microservices Pet Store - build with Maven
  * Create an Azure Container Registry
  * Push your app to the container registry
  * Create an Azure App Services (AAS) Cluster
  * Deploy each of the Microservies to AAS
  * Verify your container images

* Pet Store on Automated CI/CD with GitHub Action  
  * CI/CD on GitHub Action
  * CI/CD in action with the app

> Refer to the [App Templates](https://github.com/microsoft/App-Templates) repo Readme for more samples that are compatible with [AzureAccelerators](https://github.com/Azure/azure-dev/).

## Prerequisites
- Local shell with Azure CLI installed or [Azure Cloud Shell](https://ms.portal.azure.com/#cloudshell/)
- Azure Subscription, on which you are able to create resources and assign permissions
  - View your subscription using ```az account show``` 
  -  If you don't have an account, you can [create one for free](https://azure.microsoft.com/free).  

## Getting Started
### Fork the repository

1.  Fork the repository by clicking the 'Fork' button on the top right of the page.
This creates a local copy of the repository for you to work in. 

2.  Configure GITHUB Actions:  Follow the insturctions in the [GITHUB_ACTIONS_CONFIG.md file](https://github.com/Azure-Samples/app-templates-springboot-app-on-ARO/blob/main/.github/GITHUB_ACTIONS_CONFIG.md) (Located in the .github folder.)

3.  Run the workflow 
   * If workflows are enabled for this repository it should run automatically. To enable the workflow run automatically, Go to Actions and enable the workflow if needed.
   * Workflow can be manually run 
     + Under your repository name, click Actions .
     + In the left sidebar, click the workflow "Build and Deploy Application".
     + Above the list of workflow runs, select Run workflow .
     + Use the Branch dropdown to select the workflow's main branch, Click Run workflow .
  

# Pet Store Website

<img width="1042" alt="petstore-screenshot" src="https://github.com/MikeTB-Microsoft/App_Template_JBoss_EAP_on_AppService/blob/main/src/jbossappser-construction/images/petstore02.png">


# Pet Store Website - IP Address 

4. If you wish to view the Pet Store Deployment, you have the following options:

- Log into the Azure Portal
- Nagivate the the "petstore_spoke_eastus" Resource Group
- Goto GitHub Actions and clink on your latest Deployment
- Scroll down to the section titled "build_java_jbosseap_petstore_app"
- Open the Section....you will see a table, that list the EXTERNAL-IP.
- The EXTERNAL-IP will relfect the location of the Deployment.  
- You can utilze the EXTERNAL-IP to view the deployed image. 
