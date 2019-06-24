// Auto-Generated
package com.github.j5ik2o.reactive.aws.elasticbeanstalk.model.ops

import software.amazon.awssdk.services.elasticbeanstalk.model._

final class DescribeEnvironmentsResponseBuilderOps(val self: DescribeEnvironmentsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentsAsScala(value: Option[Seq[EnvironmentDescription]]): DescribeEnvironmentsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.environments(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeEnvironmentsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeEnvironmentsResponseOps(val self: DescribeEnvironmentsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def environmentsAsScala: Option[Seq[EnvironmentDescription]] = Option(self.environments).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeEnvironmentsResponseOps {

  implicit def toDescribeEnvironmentsResponseBuilderOps(
      v: DescribeEnvironmentsResponse.Builder
  ): DescribeEnvironmentsResponseBuilderOps = new DescribeEnvironmentsResponseBuilderOps(v)

  implicit def toDescribeEnvironmentsResponseOps(v: DescribeEnvironmentsResponse): DescribeEnvironmentsResponseOps =
    new DescribeEnvironmentsResponseOps(v)

}
