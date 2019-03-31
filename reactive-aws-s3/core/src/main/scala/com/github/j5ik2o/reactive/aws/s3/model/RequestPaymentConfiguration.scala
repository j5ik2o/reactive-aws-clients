package com.github.j5ik2o.reactive.aws.s3.model

final case class RequestPaymentConfiguration(
    payer: Option[Payer] = None
) {
  def withPayer(value: Option[Payer]): RequestPaymentConfiguration =
    copy(payer = value)
}
