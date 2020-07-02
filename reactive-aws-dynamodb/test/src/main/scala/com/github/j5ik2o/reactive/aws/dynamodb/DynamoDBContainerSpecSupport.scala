package com.github.j5ik2o.reactive.aws.dynamodb

import com.amazonaws.auth.{ AWSStaticCredentialsProvider, BasicAWSCredentials }
import com.amazonaws.client.builder.AwsClientBuilder.EndpointConfiguration
import com.amazonaws.regions.Regions
import com.amazonaws.services.dynamodbv2.{ AmazonDynamoDB, AmazonDynamoDBClientBuilder }
import com.github.j5ik2o.reactive.aws.test.RandomPortSupport
import com.spotify.docker.client.{ DefaultDockerClient, DockerClient }
import com.whisk.docker.impl.spotify.SpotifyDockerFactory
import com.whisk.docker.scalatest.DockerTestKit
import com.whisk.docker.{
  DockerCommandExecutor,
  DockerContainer,
  DockerContainerState,
  DockerFactory,
  DockerReadyChecker
}
import org.scalatest.Suite

import scala.concurrent.duration._
import scala.concurrent.{ ExecutionContext, Future }

trait DynamoDBContainerSpecSupport extends DockerTestKit with RandomPortSupport {
  this: Suite =>

  protected val connectTimeout: FiniteDuration     = 3 seconds
  protected val readTimeout: FiniteDuration        = 3 seconds
  protected val readyCheckInterval: FiniteDuration = 1 seconds

  protected val dockerClient: DockerClient =
    DefaultDockerClient
      .fromEnv()
      .connectTimeoutMillis(connectTimeout.toMillis)
      .readTimeoutMillis(readTimeout.toMillis).build()

  protected lazy val accessKeyId     = "x"
  protected lazy val secretAccessKey = "x"
  protected lazy val endpoint        = s"http://127.0.0.1:$dynamoDBPort"

  protected def dynamoDbClient: AmazonDynamoDB =
    AmazonDynamoDBClientBuilder
      .standard().withCredentials(
        new AWSStaticCredentialsProvider(
          new BasicAWSCredentials(accessKeyId, secretAccessKey)
        )
      ).withEndpointConfiguration(
        new EndpointConfiguration(endpoint, Regions.AP_NORTHEAST_1.getName)
      ).build()

  override implicit def dockerFactory: DockerFactory =
    new SpotifyDockerFactory(dockerClient)

  protected class DynamoDBDockerReadyChecker(dynamoDbClient: AmazonDynamoDB) extends DockerReadyChecker {
    override def apply(container: DockerContainerState)(implicit
        docker: DockerCommandExecutor,
        ec: ExecutionContext
    ): Future[Boolean] =
      Future.successful {
        try {
          dynamoDbClient.listTables(1)
          Thread.sleep(readyCheckInterval.toMillis)
          true
        } catch {
          case _: Exception =>
            Thread.sleep(readyCheckInterval.toMillis)
            false
        }
      }
  }

  protected lazy val dynamoDBPort: Int = temporaryServerPort()

  protected lazy val dynamoDBContainer: DockerContainer =
    DockerContainer("amazon/dynamodb-local:1.12.0")
      .withPorts(8000 -> Some(dynamoDBPort))
      .withReadyChecker(new DynamoDBDockerReadyChecker(dynamoDbClient))

  abstract override def dockerContainers: List[DockerContainer] =
    dynamoDBContainer :: super.dockerContainers
}
