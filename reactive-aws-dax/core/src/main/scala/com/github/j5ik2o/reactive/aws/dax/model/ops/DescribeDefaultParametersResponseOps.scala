// Auto-Generated
package com.github.j5ik2o.reactive.aws.dax.model.ops

import software.amazon.awssdk.services.dax.model._

final class DescribeDefaultParametersResponseBuilderOps(val self: DescribeDefaultParametersResponse.Builder)
    extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): DescribeDefaultParametersResponse.Builder = {
    value.fold(self) { v => self.nextToken(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parametersAsScala(value: Option[Seq[Parameter]]): DescribeDefaultParametersResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.parameters(v.asJava)
    }
  }

}

final class DescribeDefaultParametersResponseOps(val self: DescribeDefaultParametersResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def parametersAsScala: Option[Seq[Parameter]] =
    Option(self.parameters).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribeDefaultParametersResponseOps {

  implicit def toDescribeDefaultParametersResponseBuilderOps(
      v: DescribeDefaultParametersResponse.Builder
  ): DescribeDefaultParametersResponseBuilderOps = new DescribeDefaultParametersResponseBuilderOps(v)

  implicit def toDescribeDefaultParametersResponseOps(
      v: DescribeDefaultParametersResponse
  ): DescribeDefaultParametersResponseOps = new DescribeDefaultParametersResponseOps(v)

}
