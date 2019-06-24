// Auto-Generated
package com.github.j5ik2o.reactive.aws.cloudformation.model.ops

import software.amazon.awssdk.services.cloudformation.model._

final class DescribeAccountLimitsResponseBuilderOps(val self: DescribeAccountLimitsResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def accountLimitsAsScala(value: Option[Seq[AccountLimit]]): DescribeAccountLimitsResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.accountLimits(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeAccountLimitsResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribeAccountLimitsResponseOps(val self: DescribeAccountLimitsResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def accountLimitsAsScala: Option[Seq[AccountLimit]] = Option(self.accountLimits).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeAccountLimitsResponseOps {

  implicit def toDescribeAccountLimitsResponseBuilderOps(
      v: DescribeAccountLimitsResponse.Builder
  ): DescribeAccountLimitsResponseBuilderOps = new DescribeAccountLimitsResponseBuilderOps(v)

  implicit def toDescribeAccountLimitsResponseOps(v: DescribeAccountLimitsResponse): DescribeAccountLimitsResponseOps =
    new DescribeAccountLimitsResponseOps(v)

}
