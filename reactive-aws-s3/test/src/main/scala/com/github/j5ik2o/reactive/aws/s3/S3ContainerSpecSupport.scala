package com.github.j5ik2o.reactive.aws.s3

import com.github.j5ik2o.reactive.aws.test.RandomPortSupport
import com.spotify.docker.client.{ DefaultDockerClient, DockerClient }
import com.whisk.docker.{
  DockerCommandExecutor,
  DockerContainer,
  DockerContainerState,
  DockerFactory,
  DockerReadyChecker
}
import com.whisk.docker.impl.spotify.SpotifyDockerFactory
import com.whisk.docker.scalatest.DockerTestKit
import org.scalatest.Suite

import scala.concurrent.{ ExecutionContext, Future }
import scala.concurrent.duration._

trait S3ContainerSpecSupport extends DockerTestKit with RandomPortSupport {
  this: Suite =>

  protected val connectTimeout: FiniteDuration = 3 seconds
  protected val readTimeout: FiniteDuration    = 3 seconds

  protected val dockerClient: DockerClient =
    DefaultDockerClient
      .fromEnv()
      .connectTimeoutMillis(connectTimeout.toMillis)
      .readTimeoutMillis(readTimeout.toMillis).build()

  protected lazy val accessKeyId     = "x"
  protected lazy val secretAccessKey = "x"
  protected lazy val endpoint        = s"http://127.0.0.1:$s3Port"

  class S3DockerReadyChecker() extends DockerReadyChecker {
    override def apply(container: DockerContainerState)(implicit docker: DockerCommandExecutor,
                                                        ec: ExecutionContext): Future[Boolean] = ???
  }

  override implicit def dockerFactory: DockerFactory =
    new SpotifyDockerFactory(dockerClient)

  protected lazy val s3Port: Int = temporaryServerPort()

  protected lazy val s3Container: DockerContainer =
    DockerContainer("amazon/dynamodb-local:1.11.475")
      .withPorts(9000 -> Some(s3Port))
      .withReadyChecker(new S3DockerReadyChecker())

  abstract override def dockerContainers: List[DockerContainer] =
    s3Container :: super.dockerContainers
}
