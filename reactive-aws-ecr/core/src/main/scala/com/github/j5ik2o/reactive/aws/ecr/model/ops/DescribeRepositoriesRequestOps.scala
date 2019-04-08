// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecr.model.ops

import software.amazon.awssdk.services.ecr.model._

final class DescribeRepositoriesRequestBuilderOps(val self: DescribeRepositoriesRequest.Builder) extends AnyVal {

  final def registryIdAsScala(value: Option[String]): DescribeRepositoriesRequest.Builder = {
    value.fold(self) { v =>
      self.registryId(v)
    }
  }

  final def repositoryNamesAsScala(value: Option[Seq[String]]): DescribeRepositoriesRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.repositoryNames(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribeRepositoriesRequest.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

  final def maxResultsAsScala(value: Option[Int]): DescribeRepositoriesRequest.Builder = {
    value.fold(self) { v =>
      self.maxResults(v)
    }
  }

}

final class DescribeRepositoriesRequestOps(val self: DescribeRepositoriesRequest) extends AnyVal {

  final def registryIdAsScala: Option[String] = Option(self.registryId)

  final def repositoryNamesAsScala: Option[Seq[String]] = Option(self.repositoryNames).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeRepositoriesRequestOps {

  implicit def toDescribeRepositoriesRequestBuilderOps(
      v: DescribeRepositoriesRequest.Builder
  ): DescribeRepositoriesRequestBuilderOps = new DescribeRepositoriesRequestBuilderOps(v)

  implicit def toDescribeRepositoriesRequestOps(v: DescribeRepositoriesRequest): DescribeRepositoriesRequestOps =
    new DescribeRepositoriesRequestOps(v)

}
