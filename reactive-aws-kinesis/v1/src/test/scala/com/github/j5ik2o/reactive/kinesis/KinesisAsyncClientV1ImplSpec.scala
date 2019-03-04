package com.github.j5ik2o.reactive.kinesis

import java.util.concurrent.Executors

import com.amazonaws.auth.{ AWSStaticCredentialsProvider, BasicAWSCredentials }
import com.amazonaws.client.builder.AwsClientBuilder.EndpointConfiguration
import com.amazonaws.regions.Regions
import com.amazonaws.services.kinesis.AmazonKinesisAsyncClientBuilder
import com.github.j5ik2o.reactive.kinesis.test.KinesisContainerSpecSupport
import org.scalatest.{ FreeSpec, Matchers }
import org.scalatest.concurrent.ScalaFutures

import scala.concurrent.ExecutionContext
import scala.concurrent.duration._

class KinesisAsyncClientV1ImplSpec extends FreeSpec with Matchers with ScalaFutures with KinesisContainerSpecSupport {
  implicit val pc: PatienceConfig = PatienceConfig(20 seconds, 1 seconds)
  implicit val executionContext: ExecutionContext =
    ExecutionContext.fromExecutorService(Executors.newCachedThreadPool())

  val underlying = AmazonKinesisAsyncClientBuilder
    .standard().withCredentials(
      new AWSStaticCredentialsProvider(
        new BasicAWSCredentials(accessKeyId, secretAccessKey)
      )
    ).withEndpointConfiguration(
      new EndpointConfiguration(endpoint, Regions.AP_NORTHEAST_1.getName)
    ).build()

  val client = KinesisAsyncClientV1(underlying)

  "KinesisAsyncClientV1Impl" - {
    "createStreams & listStreams" in {
      val response = client.createStream("test-1", 1).futureValue
      response.isSuccessful shouldBe true
    }
  }

}
