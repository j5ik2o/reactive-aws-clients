// Auto-Generated
package com.github.j5ik2o.reactive.aws.eks.model.ops

import software.amazon.awssdk.services.eks.model._

final class ListFargateProfilesResponseBuilderOps(val self: ListFargateProfilesResponse.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fargateProfileNamesAsScala(value: Option[Seq[String]]): ListFargateProfilesResponse.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.fargateProfileNames(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala(value: Option[String]): ListFargateProfilesResponse.Builder = {
    value.fold(self) { v =>
      self.nextToken(v)
    }
  }

}

final class ListFargateProfilesResponseOps(val self: ListFargateProfilesResponse) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def fargateProfileNamesAsScala: Option[Seq[String]] = Option(self.fargateProfileNames).map { v =>
    import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def nextTokenAsScala: Option[String] = Option(self.nextToken)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToListFargateProfilesResponseOps {

  implicit def toListFargateProfilesResponseBuilderOps(
      v: ListFargateProfilesResponse.Builder
  ): ListFargateProfilesResponseBuilderOps = new ListFargateProfilesResponseBuilderOps(v)

  implicit def toListFargateProfilesResponseOps(v: ListFargateProfilesResponse): ListFargateProfilesResponseOps =
    new ListFargateProfilesResponseOps(v)

}
