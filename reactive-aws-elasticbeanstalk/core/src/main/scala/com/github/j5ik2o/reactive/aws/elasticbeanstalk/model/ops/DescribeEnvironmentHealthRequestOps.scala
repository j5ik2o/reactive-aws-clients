// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class DescribeEnvironmentHealthRequestBuilderOps(val self: DescribeEnvironmentHealthRequest.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentNameAsScala(value: Option[String]): DescribeEnvironmentHealthRequest.Builder = {
    value.fold(self) { v =>
      self.environmentName(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentIdAsScala(value: Option[String]): DescribeEnvironmentHealthRequest.Builder = {
    value.fold(self) { v =>
      self.environmentId(v)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributeNamesAsScala(
      value: Option[Seq[EnvironmentHealthAttribute]]
  ): DescribeEnvironmentHealthRequest.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.attributeNames(v.asJava)
    }
  }

}

final class DescribeEnvironmentHealthRequestOps(val self: DescribeEnvironmentHealthRequest) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentNameAsScala: Option[String] = Option(self.environmentName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentIdAsScala: Option[String] = Option(self.environmentId)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def attributeNamesAsScala: Option[Seq[EnvironmentHealthAttribute]] = Option(self.attributeNames).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeEnvironmentHealthRequestOps {

  implicit def toDescribeEnvironmentHealthRequestBuilderOps(
      v: DescribeEnvironmentHealthRequest.Builder
  ): DescribeEnvironmentHealthRequestBuilderOps = new DescribeEnvironmentHealthRequestBuilderOps(v)

  implicit def toDescribeEnvironmentHealthRequestOps(
      v: DescribeEnvironmentHealthRequest
  ): DescribeEnvironmentHealthRequestOps = new DescribeEnvironmentHealthRequestOps(v)

}
