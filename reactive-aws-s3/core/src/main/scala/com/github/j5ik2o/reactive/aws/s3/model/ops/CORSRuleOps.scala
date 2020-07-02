// Auto-Generated
package com.github.j5ik2o.reactive.aws.s3.model.ops

import software.amazon.awssdk.services.s3.model._

final class CORSRuleBuilderOps(val self: CORSRule.Builder) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def allowedHeadersAsScala(value: Option[Seq[String]]): CORSRule.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.allowedHeaders(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def allowedMethodsAsScala(value: Option[Seq[String]]): CORSRule.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.allowedMethods(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def allowedOriginsAsScala(value: Option[Seq[String]]): CORSRule.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.allowedOrigins(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def exposeHeadersAsScala(value: Option[Seq[String]]): CORSRule.Builder = {
    value.filter(_.nonEmpty).fold(self) { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; self.exposeHeaders(v.asJava)
    }
  }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxAgeSecondsAsScala(value: Option[Int]): CORSRule.Builder = {
    value.fold(self) { v => self.maxAgeSeconds(v) }
  }

}

final class CORSRuleOps(val self: CORSRule) extends AnyVal {

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def allowedHeadersAsScala: Option[Seq[String]] =
    Option(self.allowedHeaders).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def allowedMethodsAsScala: Option[Seq[String]] =
    Option(self.allowedMethods).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def allowedOriginsAsScala: Option[Seq[String]] =
    Option(self.allowedOrigins).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def exposeHeadersAsScala: Option[Seq[String]] =
    Option(self.exposeHeaders).map { v =>
      import com.github.j5ik2o.reactive.aws.utils.JavaCollectionHelper._; v.asScala
    }

  @SuppressWarnings(Array("org.wartremover.warts.AsInstanceOf"))
  final def maxAgeSecondsAsScala: Option[Int] = Option(self.maxAgeSeconds)

}

@SuppressWarnings(Array("org.wartremover.warts.ImplicitConversion"))
trait ToCORSRuleOps {

  implicit def toCORSRuleBuilderOps(v: CORSRule.Builder): CORSRuleBuilderOps = new CORSRuleBuilderOps(v)

  implicit def toCORSRuleOps(v: CORSRule): CORSRuleOps = new CORSRuleOps(v)

}
