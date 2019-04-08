// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class DescribeImagesRequestBuilderOps(val self: DescribeImagesRequest.Builder) extends AnyVal {

  final def registryIdAsScala(value: Option[String]): DescribeImagesRequest.Builder = {
    value.fold(self) { v =>
      self.registryId(v)
    }
  }

  final def repositoryNameAsScala(value: Option[String]): DescribeImagesRequest.Builder = {
    value.fold(self) { v =>
      self.repositoryName(v)
    }
  }

  final def imageIdsAsScala(value: Option[Seq[ImageIdentifier]]): DescribeImagesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.imageIds(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeImagesRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): DescribeImagesRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  final def filterAsScala(value: Option[DescribeImagesFilter]): DescribeImagesRequest.Builder = {
    value.fold(self) { v =>
      self.filter(v)
    }
  }

}

final class DescribeImagesRequestOps(val self: DescribeImagesRequest) extends AnyVal {

  final def registryIdAsScala: Option[String] = Option(self.registryId)

  final def repositoryNameAsScala: Option[String] = Option(self.repositoryName)

  final def imageIdsAsScala: Option[Seq[ImageIdentifier]] = Option(self.imageIds).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  final def filterAsScala: Option[DescribeImagesFilter] = Option(self.filter)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeImagesRequestOps {

  implicit def toDescribeImagesRequestBuilderOps(v: DescribeImagesRequest.Builder): DescribeImagesRequestBuilderOps =
    new DescribeImagesRequestBuilderOps(v)

  implicit def toDescribeImagesRequestOps(v: DescribeImagesRequest): DescribeImagesRequestOps =
    new DescribeImagesRequestOps(v)

}
