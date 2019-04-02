package com.github.j5ik2o.reactive.aws.s3

import com.github.j5ik2o.reactive.aws.s3.model.{ CreateBucketRequest, GetObjectRequest, PutObjectRequest }
import org.scalatest.concurrent.ScalaFutures
import org.scalatest.{ FreeSpec, Matchers }
import software.amazon.awssdk.core.async.AsyncRequestBody

import scala.concurrent.duration._

class S3AsyncClientImplSpec extends FreeSpec with Matchers with ScalaFutures with S3ContainerSpecSupport {
  implicit val pc: PatienceConfig = PatienceConfig(30 seconds, 1 seconds)

  lazy val s3Client = S3AsyncClient(javaS3Client)

  "S3AsyncClientImpl" - {
    "create bucket, put object, get object" in {
      val value = "abc"
      s3Client.createBucket(CreateBucketRequest().withBucket(Some("test"))).futureValue
      s3Client
        .putObject(PutObjectRequest().withBucket(Some("test")).withKey(Some("test")),
                   AsyncRequestBody.fromString(value)).futureValue
      val response =
        s3Client.getObjectAsBytes(GetObjectRequest().withBucket(Some("test")).withKey(Some("test"))).futureValue
      response.asUtf8String() shouldBe value
    }
  }

}
