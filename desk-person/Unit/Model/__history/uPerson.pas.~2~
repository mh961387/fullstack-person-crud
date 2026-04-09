unit uPerson;

interface

uses
  System.SysUtils;

type
  TPerson = class
  private
    FId: Int64;
    FFirstName: string;
    FLastName: string;
    FAddress: string;
    FZipCode: Int64;
    FCity: string;
    FState: string;
    FGender: string;
    FDateBirth: TDate;
    FDocument: Int64;
    FFone: string;

    procedure SetFirstName(const Value: string);
    procedure SetLastName(const Value: string);
    procedure SetAddress(const Value: string);
    procedure SetZipCode(const Value: Int64);
    procedure SetCity(const Value: string);
    procedure SetState(const Value: string);
    procedure SetGender(const Value: string);
    procedure SetDateBirth(const Value: TDate);
    procedure SetDocument(const Value: Int64);
    procedure SetFone(const Value: string);

  public
    constructor Create;

    property Id: Int64 read FId write FId;
    property FirstName: string read FFirstName write SetFirstName;
    property LastName: string read FLastName write SetLastName;
    property Address: string read FAddress write SetAddress;
    property ZipCode: Int64 read FZipCode write SetZipCode;
    property City: string read FCity write SetCity;
    property State: string read FState write SetState;
    property Gender: string read FGender write SetGender;
    property DateBirth: TDate read FDateBirth write SetDateBirth;
    property Document: Int64 read FDocument write SetDocument;
    property Fone: string read FFone write SetFone;
  end;

implementation

{ TPerson }

constructor TPerson.Create;
begin
  inherited Create;
end;

procedure TPerson.SetAddress(const Value: string);
begin
  if Value.Trim.IsEmpty then
    raise Exception.Create('Address is required');
  FAddress := Value;
end;

procedure TPerson.SetCity(const Value: string);
begin
  FCity := Value;
end;

procedure TPerson.SetDateBirth(const Value: TDate);
begin
  if Value > Date then
    raise Exception.Create('Invalid birth date');
  FDateBirth := Value;
end;

procedure TPerson.SetDocument(const Value: Int64);
begin
  if Value <= 0 then
    raise Exception.Create('Invalid document');
  FDocument := Value;
end;

procedure TPerson.SetFirstName(const Value: string);
begin
  if Value.Trim.IsEmpty then
    raise Exception.Create('First name is required');
  FFirstName := Value;
end;

procedure TPerson.SetFone(const Value: string);
begin
  FFone := Value;
end;

procedure TPerson.SetGender(const Value: string);
begin
  FGender := Value.ToUpper;
end;

procedure TPerson.SetLastName(const Value: string);
begin
  if Value.Trim.IsEmpty then
    raise Exception.Create('Last name is required');
  FLastName := Value;
end;

procedure TPerson.SetState(const Value: string);
begin
  FState := Value;
end;

procedure TPerson.SetZipCode(const Value: Int64);
begin
  FZipCode := Value;
end;

end.
