package com.github.j5ik2o.reactive.aws.s3

import org.scalatest.concurrent.ScalaFutures
import org.scalatest.{ FreeSpec, Matchers }
import software.amazon.awssdk.core.async.AsyncRequestBody
import software.amazon.awssdk.services.s3.model._

import scala.concurrent.duration._

class S3AsyncClientImplSpec extends FreeSpec with Matchers with ScalaFutures with S3ContainerSpecSupport {
  implicit val pc: PatienceConfig = PatienceConfig(20 seconds, 1 seconds)

  lazy val s3Client = S3AsyncClient(javaS3Client)

  "S3AsyncClientImpl" - {
    "create bucket, put object, get object" ignore {
      val value = "abc"
      s3Client.createBucket(CreateBucketRequest.builder().bucket("test").build()).futureValue
      s3Client
        .putObject(
          PutObjectRequest.builder().bucket("test").key("test").build(),
          AsyncRequestBody.fromString(value)
        ).futureValue
      val response =
        s3Client.getObjectAsBytes(GetObjectRequest.builder().bucket("test").key("test").build()).futureValue
      response.asUtf8String() shouldBe value
    }
  }

}
