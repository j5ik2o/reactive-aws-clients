// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class DescribePrincipalIdFormatResponseBuilderOps(val self: DescribePrincipalIdFormatResponse.Builder)
    extends AnyVal {

  final def principalsAsScala(value: Option[Seq[PrincipalIdFormat]]): DescribePrincipalIdFormatResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import scala.collection.JavaConverters._; self.principals(v.asJava)
    }
  }

  final def nextTokenAsScala(value: Option[String]): DescribePrincipalIdFormatResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class DescribePrincipalIdFormatResponseOps(val self: DescribePrincipalIdFormatResponse) extends AnyVal {

  final def principalsAsScala: Option[Seq[PrincipalIdFormat]] = Option(self.principals).map { v =>
    import scala.collection.JavaConverters._; v.asScala
  }

  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToDescribePrincipalIdFormatResponseOps {

  implicit def toDescribePrincipalIdFormatResponseBuilderOps(
      v: DescribePrincipalIdFormatResponse.Builder
  ): DescribePrincipalIdFormatResponseBuilderOps = new DescribePrincipalIdFormatResponseBuilderOps(v)

  implicit def toDescribePrincipalIdFormatResponseOps(
      v: DescribePrincipalIdFormatResponse
  ): DescribePrincipalIdFormatResponseOps = new DescribePrincipalIdFormatResponseOps(v)

}
