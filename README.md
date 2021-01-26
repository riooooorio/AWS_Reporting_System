# Antra SEP java evaluation project
## 1. Setup the environment and make it run.
 All three projects are Sprintboot application.<br>

 Need to setup AWS SNS/SQS/S3 in order to use the async API.(Videos in LMS)<br>

 Make sure to update your <i>application.properties</i> file with your AWS IAM account secrets and region.(Videos in LMS)

 AWS Lambda(Sending email) is optional. Code is in [sendEmailCode.py](./lambda/sendEmailCode.py)

## 2. Understand the structure and details
Look at the [ReportingSystemArchitecture.pdf](./ReportingSystemArchitecture.pdf)

## 3. Make improvement in the code/system level.
Improvements:
1. Add new features like update/delete/edit report.
2. Improve sync API performance by using multithreading and sending request concurrently to both services. 
3. Use MySql database instead of hashmap in the ExcelRepositoryImpl.
4. In ExcelServiceImpl class,filea are also stored in AWS S3 Bucket.
5. For configuration files, set up the S3 bucket and secretKey/accessKey to make the message Queue work
6. Add Email queue in AWS lamda Function to send emails.
7. Modified the tests.
8. Change MongoDB to DynamoDB. 
9. Fix bugs. 


## 4. Send your code to [Dawei Zhuang(dawei.zhuang@antra.com)](dawei.zhuang@antra.com) using Github/Gitlab. 
Make sure there is README.MD to indicate what did you change/add to the project.
