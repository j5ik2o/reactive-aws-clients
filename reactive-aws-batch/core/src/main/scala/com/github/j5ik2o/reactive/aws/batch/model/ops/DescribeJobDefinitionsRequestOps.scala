// Auto-Generated
package com.github.j5ik2o.reactive.aws.batch.model.ops

import software.amazon.awssdk.services.batch.model._

final class DescribeJobDefinitionsRequestBuilderOps(val self: DescribeJobDefinitionsRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobDefinitionsAsScala(value: Option[Seq[String]]): DescribeJobDefinitionsRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.jobDefinitions(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala(value: Option[Int]): DescribeJobDefinitionsRequest.Builder = {
    value.fold(self) { v => self.maxResults(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobDefinitionNameAsScala(value: Option[String]): DescribeJobDefinitionsRequest.Builder = {
    value.fold(self) { v => self.jobDefinitionName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[String]): DescribeJobDefinitionsRequest.Builder = {
    value.fold(self) { v => self.status(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeJobDefinitionsRequest.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class DescribeJobDefinitionsRequestOps(val self: DescribeJobDefinitionsRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobDefinitionsAsScala: Option[Seq[String]] =
    Option(self.jobDefinitions).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxResultsAsScala: Option[Int] = Option(self.maxResults)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def jobDefinitionNameAsScala: Option[String] = Option(self.jobDefinitionName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[String] = Option(self.status)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeJobDefinitionsRequestOps {

  implicit def toDescribeJobDefinitionsRequestBuilderOps(
      v: DescribeJobDefinitionsRequest.Builder
  ): DescribeJobDefinitionsRequestBuilderOps = new DescribeJobDefinitionsRequestBuilderOps(v)

  implicit def toDescribeJobDefinitionsRequestOps(v: DescribeJobDefinitionsRequest): DescribeJobDefinitionsRequestOps =
    new DescribeJobDefinitionsRequestOps(v)

}
