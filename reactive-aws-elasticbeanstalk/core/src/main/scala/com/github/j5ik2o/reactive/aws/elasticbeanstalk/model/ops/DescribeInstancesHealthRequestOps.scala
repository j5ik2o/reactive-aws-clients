// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class DescribeInstancesHealthRequestBuilderOps(val self: DescribeInstancesHealthRequest.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentNameAsScala(value: Option[String]): DescribeInstancesHealthRequest.Builder = {
    value.fold(self) { v => self.environmentName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentIdAsScala(value: Option[String]): DescribeInstancesHealthRequest.Builder = {
    value.fold(self) { v => self.environmentId(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributeNamesAsScala(
      value: Option[Seq[InstancesHealthAttribute]]
  ): DescribeInstancesHealthRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.attributeNames(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeInstancesHealthRequest.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

}

final class DescribeInstancesHealthRequestOps(val self: DescribeInstancesHealthRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentNameAsScala: Option[String] = Option(self.environmentName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentIdAsScala: Option[String] = Option(self.environmentId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributeNamesAsScala: Option[Seq[InstancesHealthAttribute]] =
    Option(self.attributeNames).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeInstancesHealthRequestOps {

  implicit def toDescribeInstancesHealthRequestBuilderOps(
      v: DescribeInstancesHealthRequest.Builder
  ): DescribeInstancesHealthRequestBuilderOps = new DescribeInstancesHealthRequestBuilderOps(v)

  implicit def toDescribeInstancesHealthRequestOps(
      v: DescribeInstancesHealthRequest
  ): DescribeInstancesHealthRequestOps = new DescribeInstancesHealthRequestOps(v)

}
