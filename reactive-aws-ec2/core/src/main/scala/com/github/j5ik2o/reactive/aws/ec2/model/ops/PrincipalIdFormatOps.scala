// Auto-Generated
package com.github.j5ik2o.reactive.aws.ec2.model.ops

import software.amazon.awssdk.services.ec2.model._

final class PrincipalIdFormatBuilderOps(val self: PrincipalIdFormat.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def arnAsScala(value: Option[String]): PrincipalIdFormat.Builder = {
    value.fold(self) { v => self.arn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusesAsScala(value: Option[Seq[IdFormat]]): PrincipalIdFormat.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.statuses(v.asJava)
    }
  }

}

final class PrincipalIdFormatOps(val self: PrincipalIdFormat) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def arnAsScala: Option[String] = Option(self.arn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusesAsScala: Option[Seq[IdFormat]] =
    Option(self.statuses).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToPrincipalIdFormatOps {

  implicit def toPrincipalIdFormatBuilderOps(v: PrincipalIdFormat.Builder): PrincipalIdFormatBuilderOps =
    new PrincipalIdFormatBuilderOps(v)

  implicit def toPrincipalIdFormatOps(v: PrincipalIdFormat): PrincipalIdFormatOps = new PrincipalIdFormatOps(v)

}
