package com.github.j5ik2o.reactive.aws.s3

import java.net.URI

import com.github.j5ik2o.reactive.aws.test.RandomPortSupport
import com.spotify.docker.client.{ DefaultDockerClient, DockerClient }
import com.whisk.docker.impl.spotify.SpotifyDockerFactory
import com.whisk.docker.scalatest.DockerTestKit
import com.whisk.docker.{
  DockerCommandExecutor,
  DockerContainer,
  DockerContainerState,
  DockerFactory,
  DockerReadyChecker,
  LogLineReceiver
}
import org.scalatest.Suite
import software.amazon.awssdk.auth.credentials.{ AwsBasicCredentials, StaticCredentialsProvider }
import software.amazon.awssdk.services.s3.S3AsyncClient

import scala.concurrent.duration._
import scala.concurrent.{ ExecutionContext, Future }
import scala.compat.java8.FutureConverters._

trait S3ContainerSpecSupport extends DockerTestKit with RandomPortSupport {
  this: Suite =>

  // override val StartContainersTimeout: FiniteDuration = 30 seconds
  protected val connectTimeout: FiniteDuration = 3 seconds
  protected val readTimeout: FiniteDuration    = 3 seconds

  protected val dockerClient: DockerClient =
    DefaultDockerClient
      .fromEnv()
      .connectTimeoutMillis(connectTimeout.toMillis)
      .readTimeoutMillis(readTimeout.toMillis).build()

  protected lazy val accessKeyId     = "AKIAIOSFODNN7EXAMPLE"
  protected lazy val secretAccessKey = "wJalrXUtnFEMI/K7MDENG/bPxRfiCYEXAMPLEKEY"
  protected lazy val endpoint        = s"http://127.0.0.1:$s3Port"

  protected lazy val javaS3Client: S3AsyncClient =
    S3AsyncClient
      .builder()
      .credentialsProvider(StaticCredentialsProvider.create(AwsBasicCredentials.create(accessKeyId, secretAccessKey)))
      .endpointOverride(URI.create(endpoint))
      .build()

  class S3DockerReadyChecker(s3client: S3AsyncClient) extends DockerReadyChecker {
    override def apply(container: DockerContainerState)(
        implicit docker: DockerCommandExecutor,
        ec: ExecutionContext
    ): Future[Boolean] =
      s3client
        .listBuckets().toScala.map { _ =>
          true
        }(ec).recover {
          case _ =>
            false
        }(ec)
  }

  override implicit def dockerFactory: DockerFactory =
    new SpotifyDockerFactory(dockerClient)

  protected lazy val s3Port: Int = temporaryServerPort()

  protected lazy val s3Container: DockerContainer =
    DockerContainer("minio/minio")
      .withPorts(9000 -> Some(s3Port))
      .withEnv(s"MINIO_ACCESS_KEY=$accessKeyId", s"MINIO_SECRET_KEY=$secretAccessKey")
      .withCommand("server", "/data")
      .withLogLineReceiver(LogLineReceiver(true, { message =>
        println(message)
      }))
      .withReadyChecker(new S3DockerReadyChecker(javaS3Client))

  abstract override def dockerContainers: List[DockerContainer] =
    s3Container :: super.dockerContainers
}
