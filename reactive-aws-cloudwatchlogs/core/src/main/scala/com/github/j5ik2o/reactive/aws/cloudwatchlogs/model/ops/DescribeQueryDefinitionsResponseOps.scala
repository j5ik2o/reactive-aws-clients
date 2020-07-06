// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudwatchlogs.model.ops

import software.amazon.awssdk.services.cloudwatchlogs.model._

final class DescribeQueryDefinitionsResponseBuilderOps(val self: DescribeQueryDefinitionsResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queryDefinitionsAsScala(value: Option[Seq[QueryDefinition]]): DescribeQueryDefinitionsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.queryDefinitions(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeQueryDefinitionsResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class DescribeQueryDefinitionsResponseOps(val self: DescribeQueryDefinitionsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def queryDefinitionsAsScala: Option[Seq[QueryDefinition]] =
    Option(self.queryDefinitions).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeQueryDefinitionsResponseOps {

  implicit def toDescribeQueryDefinitionsResponseBuilderOps(
      v: DescribeQueryDefinitionsResponse.Builder
  ): DescribeQueryDefinitionsResponseBuilderOps = new DescribeQueryDefinitionsResponseBuilderOps(v)

  implicit def toDescribeQueryDefinitionsResponseOps(
      v: DescribeQueryDefinitionsResponse
  ): DescribeQueryDefinitionsResponseOps = new DescribeQueryDefinitionsResponseOps(v)

}
