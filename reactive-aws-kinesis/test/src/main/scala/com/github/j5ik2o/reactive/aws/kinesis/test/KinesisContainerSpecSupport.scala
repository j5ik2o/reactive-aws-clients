package com.github.j5ik2o.reactive.aws.kinesis.test

import com.spotify.docker.client.{ DefaultDockerClient, DockerClient }
import com.whisk.docker.impl.spotify.SpotifyDockerFactory
import com.whisk.docker.scalatest.DockerTestKit
import com.whisk.docker.{ DockerContainer, DockerFactory, DockerReadyChecker }
import org.scalatest.Suite

import scala.concurrent.duration._

trait KinesisContainerSpecSupport extends DockerTestKit with RandomPortSupport {
  this: Suite =>

  protected val connectTimeout: FiniteDuration = 3 seconds
  protected val readTimeout: FiniteDuration    = 3 seconds

  protected lazy val accessKeyId      = "000000000000"
  protected lazy val secretAccessKey  = "000000000000"
  protected lazy val endpoint         = s"http://127.0.0.1:$kinesisPort"
  protected lazy val kinesisPort: Int = temporaryServerPort()

  protected lazy val dynamoDBContainer: DockerContainer =
    DockerContainer("vsouza/kinesis-local:latest")
      .withCommand("--port 4567 --shardLimit 100 --createStreamMs 0 --deleteStreamMs 0 --updateStreamMs 0")
      .withPorts(4567 -> Some(kinesisPort))
      .withReadyChecker(DockerReadyChecker.LogLineContains("Listening at http://"))

  protected val dockerClient: DockerClient =
    DefaultDockerClient
      .fromEnv()
      .connectTimeoutMillis(connectTimeout.toMillis)
      .readTimeoutMillis(readTimeout.toMillis).build()

  abstract override def dockerContainers: List[DockerContainer] =
    dynamoDBContainer :: super.dockerContainers

  override implicit def dockerFactory: DockerFactory =
    new SpotifyDockerFactory(dockerClient)

}
