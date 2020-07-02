// Auto-Generated
package com.github.j5ik2o.reactive.aws.ecs.model.ops

import software.amazon.awssdk.services.ecs.model._

final class DescribeTaskDefinitionRequestBuilderOps(val self: DescribeTaskDefinitionRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskDefinitionAsScala(value: Option[String]): DescribeTaskDefinitionRequest.Builder = {
    value.fold(self) { v => self.taskDefinition(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def includeAsScala(value: Option[Seq[TaskDefinitionField]]): DescribeTaskDefinitionRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.include(v.asJava)
    }
  }

}

final class DescribeTaskDefinitionRequestOps(val self: DescribeTaskDefinitionRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def taskDefinitionAsScala: Option[String] = Option(self.taskDefinition)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def includeAsScala: Option[Seq[TaskDefinitionField]] =
    Option(self.include).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeTaskDefinitionRequestOps {

  implicit def toDescribeTaskDefinitionRequestBuilderOps(
      v: DescribeTaskDefinitionRequest.Builder
  ): DescribeTaskDefinitionRequestBuilderOps = new DescribeTaskDefinitionRequestBuilderOps(v)

  implicit def toDescribeTaskDefinitionRequestOps(v: DescribeTaskDefinitionRequest): DescribeTaskDefinitionRequestOps =
    new DescribeTaskDefinitionRequestOps(v)

}
