// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class FargateProfileBuilderOps(val self: FargateProfile.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fargateProfileNameAsScala(value: Option[String]): FargateProfile.Builder = {
    value.fold(self) { v => self.fargateProfileName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fargateProfileArnAsScala(value: Option[String]): FargateProfile.Builder = {
    value.fold(self) { v => self.fargateProfileArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterNameAsScala(value: Option[String]): FargateProfile.Builder = {
    value.fold(self) { v => self.clusterName(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createdAtAsScala(value: Option[java.time.Instant]): FargateProfile.Builder = {
    value.fold(self) { v => self.createdAt(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def podExecutionRoleArnAsScala(value: Option[String]): FargateProfile.Builder = {
    value.fold(self) { v => self.podExecutionRoleArn(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetsAsScala(value: Option[Seq[String]]): FargateProfile.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.subnets(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def selectorsAsScala(value: Option[Seq[FargateProfileSelector]]): FargateProfile.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.selectors(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala(value: Option[FargateProfileStatus]): FargateProfile.Builder = {
    value.fold(self) { v => self.status(v) }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala(value: Option[Map[String, String]]): FargateProfile.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.tags(v.asJava)
    }
  }

}

final class FargateProfileOps(val self: FargateProfile) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fargateProfileNameAsScala: Option[String] = Option(self.fargateProfileName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fargateProfileArnAsScala: Option[String] = Option(self.fargateProfileArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def clusterNameAsScala: Option[String] = Option(self.clusterName)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def createdAtAsScala: Option[java.time.Instant] = Option(self.createdAt)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def podExecutionRoleArnAsScala: Option[String] = Option(self.podExecutionRoleArn)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def subnetsAsScala: Option[Seq[String]] =
    Option(self.subnets).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def selectorsAsScala: Option[Seq[FargateProfileSelector]] =
    Option(self.selectors).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def statusAsScala: Option[FargateProfileStatus] = Option(self.status)

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def tagsAsScala: Option[Map[String, String]] =
    Option(self.tags).map { v => import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala.toMap }

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToFargateProfileOps {

  implicit def toFargateProfileBuilderOps(v: FargateProfile.Builder): FargateProfileBuilderOps =
    new FargateProfileBuilderOps(v)

  implicit def toFargateProfileOps(v: FargateProfile): FargateProfileOps = new FargateProfileOps(v)

}
