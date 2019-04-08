// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class DescribeTaskDefinitionRequestBuilderOps(val self: DescribeTaskDefinitionRequest.Builder) extends AnyVal {

  final def taskDefinitionAsScala(value: Option[String]): DescribeTaskDefinitionRequest.Builder = {
    value.fold(self) { v =>
      self.taskDefinition(v)
    }
  }

  final def includeAsScala(value: Option[Seq[TaskDefinitionField]]): DescribeTaskDefinitionRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.include(v.asJava)
    }
  }

}

final class DescribeTaskDefinitionRequestOps(val self: DescribeTaskDefinitionRequest) extends AnyVal {

  final def taskDefinitionAsScala: Option[String] = Option(self.taskDefinition)

  final def includeAsScala: Option[Seq[TaskDefinitionField]] = Option(self.include).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeTaskDefinitionRequestOps {

  implicit def toDescribeTaskDefinitionRequestBuilderOps(
      v: DescribeTaskDefinitionRequest.Builder
  ): DescribeTaskDefinitionRequestBuilderOps = new DescribeTaskDefinitionRequestBuilderOps(v)

  implicit def toDescribeTaskDefinitionRequestOps(v: DescribeTaskDefinitionRequest): DescribeTaskDefinitionRequestOps =
    new DescribeTaskDefinitionRequestOps(v)

}
