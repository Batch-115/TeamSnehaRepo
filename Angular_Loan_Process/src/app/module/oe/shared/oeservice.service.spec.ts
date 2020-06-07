import { TestBed } from '@angular/core/testing';

import { OeserviceService } from './oeservice.service';

describe('OeserviceService', () => {
  beforeEach(() => TestBed.configureTestingModule({}));

  it('should be created', () => {
    const service: OeserviceService = TestBed.get(OeserviceService);
    expect(service).toBeTruthy();
  });
});
