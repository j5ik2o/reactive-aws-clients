package com.github.j5ik2o.reactive.aws.s3

import com.github.j5ik2o.reactive.aws.model.AsyncRequestBody
import com.github.j5ik2o.reactive.aws.s3.model.{ CreateBucketRequest, GetObjectRequest, PutObjectRequest }
import org.scalatest.concurrent.ScalaFutures
import org.scalatest.{ FreeSpec, Matchers }

import scala.concurrent.duration._

class S3AsyncClientImplSpec extends FreeSpec with Matchers with ScalaFutures with S3ContainerSpecSupport {
  implicit val pc: PatienceConfig = PatienceConfig(20 seconds, 1 seconds)

  lazy val s3Client = S3AsyncClient(javaS3Client)

  "S3AsyncClientImpl" - {
    "create bucket" in {
      s3Client.createBucket(CreateBucketRequest().withBucket(Some("test"))).futureValue
      s3Client
        .putObject(PutObjectRequest().withBucket(Some("test")).withKey(Some("test")),
                   AsyncRequestBody.fromString("TEST")).futureValue
//      val result =
//        s3Client.getObjectAsBytes(GetObjectRequest().withBucket(Some("test")).withKey(Some("test"))).futureValue
      val result =
        s3Client.getObjectAsIterable(GetObjectRequest().withBucket(Some("test")).withKey(Some("test"))).futureValue
      println(new String(result.data.toList.flatten.toArray))
    }
  }

}
