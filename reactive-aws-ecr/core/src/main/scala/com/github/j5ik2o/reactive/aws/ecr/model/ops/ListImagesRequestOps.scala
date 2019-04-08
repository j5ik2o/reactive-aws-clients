// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class ListImagesRequestBuilderOps(val self: ListImagesRequest.Builder) extends AnyVal {

  final def registryIdAsScala(value: Option[String]): ListImagesRequest.Builder = {
    value.fold(self) { v =>
      self.registryId(v)
    }
  }

  final def repositoryNameAsScala(value: Option[String]): ListImagesRequest.Builder = {
    value.fold(self) { v =>
      self.repositoryName(v)
    }
  }

  final def nextTokenAsScala(value: Option[String]): ListImagesRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): ListImagesRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

  final def filterAsScala(value: Option[ListImagesFilter]): ListImagesRequest.Builder = {
    value.fold(self) { v =>
      self.filter(v)
    }
  }

}

final class ListImagesRequestOps(val self: ListImagesRequest) extends AnyVal {

  final def registryIdAsScala: Option[String] = Option(self.registryId)

  final def repositoryNameAsScala: Option[String] = Option(self.repositoryName)

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  final def filterAsScala: Option[ListImagesFilter] = Option(self.filter)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListImagesRequestOps {

  implicit def toListImagesRequestBuilderOps(v: ListImagesRequest.Builder): ListImagesRequestBuilderOps =
    new ListImagesRequestBuilderOps(v)

  implicit def toListImagesRequestOps(v: ListImagesRequest): ListImagesRequestOps = new ListImagesRequestOps(v)

}
