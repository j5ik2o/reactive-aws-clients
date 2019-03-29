package com.github.j5ik2o.reactive.aws.kinesis

import java.net.URI
import java.util.concurrent.Executors

import com.github.j5ik2o.reactive.aws.kinesis.test.KinesisContainerSpecSupport
import com.github.j5ik2o.reactive.aws.kinesis.v2.KinesisAsyncClient
import org.scalatest.concurrent.ScalaFutures
import org.scalatest.{ FreeSpec, Matchers }
import software.amazon.awssdk.auth.credentials.{ AwsBasicCredentials, StaticCredentialsProvider }
import software.amazon.awssdk.http.nio.netty.NettyNioAsyncHttpClient
import software.amazon.awssdk.services.kinesis.{ KinesisAsyncClient => JavaKinesisAsyncClient }

import scala.concurrent.ExecutionContext
import scala.concurrent.duration._

class KinesisAsyncClientImplSpec extends FreeSpec with Matchers with ScalaFutures with KinesisContainerSpecSupport {

  implicit val pc: PatienceConfig = PatienceConfig(20 seconds, 1 seconds)
  implicit val executionContext: ExecutionContext =
    ExecutionContext.fromExecutorService(Executors.newCachedThreadPool())

  val underlying = JavaKinesisAsyncClient
    .builder()
    .httpClient(NettyNioAsyncHttpClient.builder().maxConcurrency(1).build())
    .credentialsProvider(
      StaticCredentialsProvider.create(AwsBasicCredentials.create(accessKeyId, secretAccessKey))
    )
    .endpointOverride(URI.create(endpoint))
    .build()

  val client = KinesisAsyncClient(underlying)

  System.setProperty("aws.cborEnabled", "false")

  "KinesisAsyncClientV2Impl" - {
    "createStreams & listStreams" in {
      val response = client.createStream("test-1", 1).futureValue
      response.isSuccessful shouldBe true
    }
  }

}
