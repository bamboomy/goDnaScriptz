package genetic;
import java.util.ArrayList;
class Thought377 extends Thought{
private static ArrayList<Thought377> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 950.4949392477379;
private double fd1 = 972.1234174882561;
private Thought fo0 = null;
private Thought fo1 = null;
Thought377 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought377 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought377 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought377 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought377 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought377 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought377 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought377 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought377 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought377 instance = new Thought377 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought377 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought377 instance = new Thought377 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought377 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought377 instance = new Thought377 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought377 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought377 instance = new Thought377 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought377 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought377 instance = new Thought377 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought377 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought377 instance = new Thought377 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought377 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought377 instance = new Thought377 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought377 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought377 instance = new Thought377 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    fd0 = fd1 + fd0;
    fb0 = fd1 < fd0;
    Output.points[7][3] -= fd1;
    double ld1 = 814.4205424580504;
    fb1 = ld1 > fd0;
    if (lb0) {
        fd1 *= -1;
if(fo1 != null){
          fo1.m3();
}
        ld1 = fd0 + fd1;
        ld1 *= -1;
        Thought lo2 = Thought52.getInstance(fb0, fb1, lb0, fb0);
        boolean lb3 = true;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, fb0, fb1, lb3, lb0);
}
        fb0 = fb1 && lb3;
        if (lb0) {
            Thought lo4 = Thought99.getInstance(fd1, ld1, fd0, fd1, fb0, fb1, lb3, lb0);
if(fo1 != null){
              fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, lb3, lb0);
}
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
            ld1 *= -1;
            fb0 = fd0 < fd1;
            boolean lb5 = true;
if(fo0 != null){
              fb0 = fo0.m2(ld1, fd0, fd1, ld1);
}
            if (fb1) {
if(fo1 != null){
                  fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
}}}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[7][4] -= fd0;
    ab1 = fd1 > fd0;
    ab2 = fd1 < fd0;
    fd1 = fd0 - fd1;
    ab3 = !ab4;
    Thought lo0 = Thought267.getInstance(fb0, fb1, ab1, ab2);
    fd0 = fd1 + fd0;
    ab3 = !ab4;
    fb0 = fd1 > fd0;
    fd1 *= -1;
    Thought lo1 = Thought147.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
if(fo0 != null){
      ab4 = fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    boolean lb2 = true;
    Output.points[7][5] += fd1;
    Output.points[7][6] -= fd0;
    double ld3 = 16.071216070361256;
    ab4 = fd0 > fd1;
    fb0 = ld3 < fd0;
    boolean lb4 = false;
    fd1 *= -1;
    fb0 = ld3 > fd0;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - ad1;
    fb1 = fb0 || fb1;
    for(int i0=0; i0<10; i0++){
        fb0 = !fb1;
if(fo1 != null){
          fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
        fd1 = ad1 + ad2;
        double ld0 = 962.9604692532249;
        Thought lo1 = Thought254.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
        double ld2 = 370.2575108530604;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, ld2, ad1);
}
        ad2 *= -1;
        boolean lb3 = false;
        lb3 = !fb0;
        Output.points[7][7] -= ad3;
        boolean lb4 = true;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4();
}
    ad2 = ad3 - ad4;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, ad1, ad2);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    lb0 = fb0 && fb1;
    lb0 = fd0 < fd1;
    fb0 = fd0 < fd1;
if(ao1 != null){
      ao1.m2();
}
    Output.points[7][8] += fd0;
    fb1 = !lb0;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb0, fb0);
}
    double ld1 = 709.8088815473549;
    double ld2 = 470.8760997242377;
    fb1 = !lb0;
    fb0 = ld2 > fd0;
    for(int i0=0; i0<10; i0++){
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    ad4 = fd0 + fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    for(int i0=0; i0<10; i0++){
        boolean lb0 = false;
if(ao3 != null){
          ad1 = ao3.m3(ad2, ad3, ad4, fd0);
}
        Thought lo1 = Thought129.getInstance(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
if(ao3 != null){
          ao2 = ao3.m4();
}
if(ao4 != null){
          ao4.m3(fb0, fb1, lb0, fb0);
}
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;
    boolean lb0 = true;
    lb0 = ab1 && ab2;
    ab3 = fd1 > fd0;
    fd1 = fd0 + fd1;
    fd0 *= -1;
    Thought lo1 = Thought101.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, lb0, ab1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    double ld2 = 223.29821957876473;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ld2, fd0, fd1);
}
    ld2 = fd0 - fd1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ab1 = ao2.m2();
}
if(ao3 != null){
      ad1 = ao3.m3(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    double ld0 = 593.1906126187537;
    if (ab4) {
        boolean lb1 = false;
        boolean lb2 = true;
if(fo0 != null){
          ao4 = fo0.m4(fd0, fd1, ld0, ad1, ab3, ab4, fb0, fb1);
}
        ad2 = ad3 + ad4;
        lb1 = fd0 < fd1;
        ld0 = ad1 + ad2;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[8][0] -= fd1;
    Thought lo0 = Thought146.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    Output.points[8][1] -= fd0;
    fd1 = fd0 + fd1;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
    Thought lo1 = Thought233.getInstance();
    Thought lo2 = Thought160.getInstance(fb1, fb0, fb1, fb0);
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Output.points[8][2] += fd1;
    fb0 = !fb1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    if (fb1) {
        double ld3 = 203.92362449559775;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1);
}
        ld3 = fd0 - fd1;
if(fo1 != null){
          fo0 = fo1.m4(ld3, fd0, fd1, ld3);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld3, fd0);
}
        fd1 *= -1;
if(fo0 != null){
          fb0 = fo0.m2();
}
        fb1 = !fb0;
        Output.points[8][3] += ld3;
}
Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    boolean lb0 = false;
    fd1 = fd0 - fd1;
    boolean lb1 = false;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, lb1, ab1, ab2);
}
    boolean lb2 = false;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    double ld3 = 838.2704101956925;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, lb1, lb2);
}
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1);
}
    ab1 = ab2 && ab3;
    boolean lb4 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld3, fd0);
}
    Thought lo5 = Thought394.getInstance(fo0, fo1, fo0, fo1, fd1, ld3, fd0, fd1);
    ab3 = !ab4;
    ld3 = fd0 - fd1;
    fb0 = ld3 > fd0;

Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fb0 = fo0.m2();
}
    Thought lo0 = Thought184.getInstance(fb1, fb0, fb1, fb0);
    Thought lo1 = Thought396.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought32.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    boolean lb3 = false;
    Thought lo4 = Thought379.getInstance(fo1, fo0, fo1, fo0);
    double ld5 = 264.1228469398076;
    fb0 = !fb1;
    Output.points[8][4] -= ad3;
if(fo1 != null){
      lb3 = fo1.m2(ad4, fd0, fd1, ld5);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
    boolean lb6 = false;
if(fo1 != null){
      fo1.m1(lb6, fb0, fb1, lb3);
}

Thought.STACK_COUNTER++;
return lb6;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
    ad3 *= -1;
    Output.points[8][5] -= ad4;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = ab1 && ab2;
    double ld0 = 29.903737126022964;
if(fo1 != null){
      fo1.m2(fd0, fd1, ld0, ad1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    Thought lo1 = Thought385.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m2(ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
    boolean lb2 = false;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb1 = fo1.m2(ld0, ad1, ad2, ad3);
}
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1);
}
    boolean lb3 = true;
if(fo1 != null){
      lb2 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(lb3, ab1, ab2, ab3);
}
    boolean lb4 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    lb2 = fd1 > ld0;

Thought.STACK_COUNTER++;
return lb3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    boolean lb0 = false;
    fd0 *= -1;
    fb0 = !fb1;
    boolean lb1 = false;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb0, lb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0);
}
    lb0 = lb1 || fb0;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
    boolean lb2 = false;
    fb0 = fd1 < fd0;
if(fo0 != null){
      ao4 = fo0.m4();
}
    boolean lb3 = true;
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, lb0, lb1);
}
    double ld4 = 477.70311741739533;
    lb2 = ld4 > fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld4, fd0, fd1, lb3, fb0, fb1, lb0);
}
    double ld5 = 744.3565035373651;
if(ao2 != null){
      ao1 = ao2.m4(ld4, ld5, fd0, fd1, lb1, lb2, lb3, fb0);
}
    boolean lb6 = false;
    fb0 = fb1 || lb0;
    lb1 = lb2 || lb3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb6, fb0, fb1, lb0);
}
    lb1 = ld4 < ld5;
    lb2 = fd0 < fd1;

Thought.STACK_COUNTER++;
return lb3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    fb0 = ad4 > fd0;
        Output.points[8][6] -= fd1;
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0);
}
    fb1 = ad2 < ad3;
    fb0 = ad4 < fd0;
if(fo1 != null){
      fb1 = fo1.m2(fd1, ad1, ad2, ad3);
}
    boolean lb0 = true;
    lb0 = ad4 < fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
    boolean lb1 = false;
if(ao1 != null){
      ad4 = ao1.m3();
}
if(ao2 != null){
      ao2.m1(lb1, fb0, fb1, lb0);
}
    lb1 = fd0 > fd1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb1);
}
    fb0 = fb1 && lb0;
if(ao2 != null){
      lb1 = ao2.m2(fd0, fd1, ad1, ad2, fb0, fb1, lb0, lb1);
}
    fb0 = !fb1;
    lb0 = lb1 && fb0;
    fb1 = lb0 || lb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb0, lb1);
}
    fb0 = ad3 > ad4;
    fb1 = fd0 < fd1;

Thought.STACK_COUNTER++;
return lb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    double ld0 = 873.1716013705695;
if(fo1 != null){
      ld0 = fo1.m3(fd0, fd1, ld0, fd0);
}
    ab2 = ab3 || ab4;
    fb0 = !fb1;
    Output.points[8][7] -= fd1;
    Output.points[8][8] += ld0;
    boolean lb1 = false;
    double ld2 = 959.0475514452631;
        for(int i0=0; i0<10; i0++){
        boolean lb3 = true;
        double ld4 = 238.37981344970748;
        ld0 *= -1;
        Thought lo5 = Thought381.getInstance(ao1, ao2, ao3, ao4, ld2, fd0, fd1, ld4);
if(fo0 != null){
          lb3 = fo0.m2();
}
if(ao1 != null){
          fo1 = ao1.m4(lb1, ab1, ab2, ab3);
}
}
Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad2 > ad3;
    boolean lb0 = false;
    ab1 = ab2 || ab3;
    Thought lo1 = Thought98.getInstance(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, ab4, fb0, fb1, lb0);
    ab1 = ad2 > ad3;
    Output.points[0][0] -= ad4;
    double ld2 = 208.88849050437972;
    ad4 = fd0 - fd1;
if(ao1 != null){
      fo1 = ao1.m4(ld2, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    boolean lb3 = false;
    ad4 *= -1;
    fb0 = fd0 > fd1;
    fb1 = lb0 && lb3;
    boolean lb4 = false;
    lb4 = ld2 > ad1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    double ld5 = 493.7116407785835;
        if (fb0) {
        double ld6 = 963.8836155568233;
        boolean lb7 = false;
}
Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb0 = fd1 > fd0;
    boolean lb0 = true;
    fd1 = fd0 - fd1;
    fb0 = fd0 < fd1;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || lb0;
    fd0 *= -1;
    lb1 = fb0 && fb1;
    fd1 = fd0 + fd1;
    fd0 *= -1;
if(fo1 != null){
      lb0 = fo1.m2();
}
    lb1 = !fb0;
if(fo0 != null){
      fb1 = fo0.m2(lb0, lb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
    lb0 = lb1 || fb0;
    fb1 = fd0 > fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, lb0, lb1, fb0, fb1);
}

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    fd0 *= -1;
    fd1 = fd0 + fd1;
    boolean lb0 = true;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb1 = lb0 && ab1;
    fd0 *= -1;
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0);
}
    double ld1 = 809.5645516633881;
    ab2 = fd0 < fd1;
    ab3 = ld1 > fd0;

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    lb0 = ad1 > ad2;
    Thought lo1 = Thought276.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = !fb1;
    lb0 = !fb0;
if(fo0 != null){
      ad4 = fo0.m3(fb1, lb0, fb0, fb1);
}
    fd0 = fd1 + ad1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
    Thought lo2 = Thought275.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    Thought lo3 = Thought211.getInstance(fo1, fo0, fo1, fo0);
    boolean lb4 = false;
    lb0 = !lb4;
    double ld5 = 854.6776779093809;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld5);
}
    fb0 = fb1 && lb0;
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld5);
}
    lb4 = ad1 > ad2;
    fb0 = fb1 || lb0;
    ad3 *= -1;
        ad4 = fd0 - fd1;
    ld5 *= -1;
    lb4 = !fb0;
    Output.points[0][1] -= ad1;
    ad2 = ad3 - ad4;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 607.0065525545997;
    ld0 = ad1 + ad2;
    ab2 = ab3 && ab4;
    ad3 *= -1;
    double ld1 = 90.35725954160141;
if(fo1 != null){
      fo1.m2();
}
if(fo0 != null){
      fb0 = fo0.m2(fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ld0 *= -1;
    ld1 = ad1 + ad2;
    ab3 = ad3 < ad4;
    double ld2 = 328.28927979184334;
    Output.points[0][2] += ad4;
    ab4 = fd0 > fd1;
    boolean lb3 = true;

Thought.STACK_COUNTER++;
return ld0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    Thought lo0 = Thought83.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    double ld1 = 5.787454032297033;
    fb0 = ld1 > fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    ld1 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ld1, fd0, fd1, ld1);
}
    Thought lo2 = Thought12.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld1, fd0);
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb3 = true;
    fb0 = fb1 && lb3;
    fb0 = fb1 && lb3;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb3, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ld1, fd0, fd1, fb1, lb3, fb0, fb1);
}
    ld1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0, lb3, fb0, fb1, lb3);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fb0, fb1, lb3, fb0);
}
    fb1 = fd1 > ld1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    double ld4 = 364.0034770076897;
    boolean lb5 = true;
if(fo1 != null){
      ld4 = fo1.m3(fd0, fd1, ld1, ld4);
}

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[0][3] += ad2;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
    Output.points[0][4] -= ad1;
    Output.points[0][5] -= ad2;
    ad3 *= -1;
    fb1 = fb0 && fb1;
    fb0 = ad4 < fd0;
    Output.points[0][6] += fd1;
if(ao1 != null){
      fo1 = ao1.m4();
}
    ad1 *= -1;
if(ao2 != null){
      fb1 = ao2.m2(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    fb0 = ad4 < fd0;
    Thought lo0 = Thought337.getInstance(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
    boolean lb1 = true;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1);
}
    for(int i0=0; i0<10; i0++){
        fb1 = fd1 < ad1;
        ad2 = ad3 + ad4;
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, ad1, ad2);
}
        double ld2 = 422.82433856864577;
}
Thought.STACK_COUNTER++;
return ad3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    ab1 = ab2 && ab3;
        boolean lb0 = true;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ao3.m1(ab3, ab4, fb0, fb1);
}
    boolean lb1 = false;
    lb0 = lb1 && ab1;
    double ld2 = 646.2528413695634;
    Output.points[0][7] += ld2;
if(ao4 != null){
      ab2 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ld2, fd0, ab3, ab4, fb0, fb1);
}

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
}
    fd0 = fd1 - ad1;
    ad2 = ad3 - ad4;
    double ld0 = 126.8694189173768;
    ab3 = ab4 && fb0;
    Thought lo1 = Thought86.getInstance(ao2, ao3, ao4, fo0);
    ad4 *= -1;
    Thought lo2 = Thought51.getInstance(fd0, fd1, ld0, ad1);
    boolean lb3 = false;
        fb0 = ad2 < ad3;
    Output.points[0][8] += ad4;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    fb0 = fd1 > fd0;
    for(int i0=0; i0<10; i0++){
        fd1 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        fb1 = fd0 > fd1;
        fb0 = fb1 && fb0;
        fb1 = fd0 < fd1;
        Output.points[1][0] -= fd0;
if(fo0 != null){
          fo1 = fo0.m4();
}
}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    fd0 *= -1;
    ab1 = fd1 < fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    boolean lb0 = false;
    fd1 *= -1;
    double ld1 = 833.8632430480227;
    ab3 = ld1 > fd0;
    Thought lo2 = Thought119.getInstance(fo1, fo0, fo1, fo0);
    ab4 = fd1 < ld1;
    Output.points[1][1] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, fd0, fd1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
    fd0 *= -1;
    boolean lb3 = false;
    Thought lo4 = Thought211.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, lb3);
}
    ab1 = ab2 && ab3;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, ab4, fb0, fb1, lb0);
}
    ld1 = fd0 + fd1;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad1 > ad2;
    fb0 = fb1 || fb0;
    fb1 = ad3 < ad4;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(ad3, ad4, fd0, fd1);
}
    boolean lb0 = false;
    ad1 = ad2 + ad3;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    fb0 = ad2 < ad3;
if(fo1 != null){
      ad4 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, fb0, fb1);
}
    fd0 *= -1;
    Thought lo1 = Thought339.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad2 < ad3;
    Output.points[1][2] += ad4;
if(fo1 != null){
      fo1.m3(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    ab1 = ad3 > ad4;
    boolean lb0 = false;
    fd0 *= -1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 < ad1;
    if (fb1) {
        boolean lb1 = false;
        Output.points[1][3] -= ad2;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        ad3 = ad4 + fd0;
        double ld2 = 564.883942473164;
        fd0 = fd1 - ld2;
        ad1 = ad2 - ad3;
        Thought lo3 = Thought299.getInstance(ad4, fd0, fd1, ld2);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
        fd0 = fd1 + ld2;
        ad1 = ad2 + ad3;
if(fo1 != null){
          fo1.m3();
}
if(fo0 != null){
          ad4 = fo0.m3(lb1, lb0, ab1, ab2);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ad1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(ad2, ad3, ad4, fd0, lb1, lb0, ab1, ab2);
}
}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought226.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    Thought lo1 = Thought243.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
    double ld2 = 829.2572661442331;
    Thought lo3 = Thought312.getInstance();
    fb1 = fb0 || fb1;
    fd0 = fd1 + ld2;
if(ao4 != null){
      fd0 = ao4.m3(fb0, fb1, fb0, fb1);
}
    Thought lo4 = Thought317.getInstance(fo0, fo1, ao1, ao2, fd1, ld2, fd0, fd1, fb0, fb1, fb0, fb1);
    fb0 = !fb1;
    fb0 = ld2 > fd0;
    double ld5 = 327.36598399278097;

Thought.STACK_COUNTER++;
return ao3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought30.getInstance(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
    fd0 = fd1 + ad1;
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    ad3 = ad4 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, ad1, ad2, ad3);
}
if(ao3 != null){
      ad4 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 + fd0;
    boolean lb1 = false;
    fd1 *= -1;
if(ao2 != null){
      ad1 = ao2.m3();
}
    Output.points[1][4] -= ad2;
if(ao3 != null){
      ao3.m3(fb0, fb1, lb1, fb0);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, fb1, lb1, fb0, fb1);
}
        lb1 = ad1 > ad2;
        fb0 = ad3 < ad4;
        Thought lo2 = Thought399.getInstance(fd0, fd1, ad1, ad2, fb1, lb1, fb0, fb1);
        double ld3 = 934.0938825060133;
        Output.points[1][5] -= ad2;
        lb1 = ad3 < ad4;
}
Thought.STACK_COUNTER++;
return ao4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd1 < fd0;
    fd1 = fd0 + fd1;
    Output.points[1][6] -= fd0;
    fd1 = fd0 + fd1;
    ab3 = ab4 && fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
}
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
    ab4 = fb0 && fb1;
    Output.points[1][7] += fd1;
    ab1 = fd0 > fd1;
    fd0 = fd1 + fd0;
    ab2 = !ab3;
    for(int i0=0; i0<10; i0++){
        ab4 = fd1 < fd0;
}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ad2 = ao1.m3(ad3, ad4, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    Thought lo0 = Thought317.getInstance();
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;
    boolean lb1 = false;
    lb1 = ab1 || ab2;
    Output.points[1][8] -= fd0;
    double ld2 = 451.5829912313265;
    double ld3 = 535.0529213378451;
    Output.points[2][0] -= ad4;
if(ao2 != null){
      fd0 = ao2.m3(ab3, ab4, fb0, fb1);
}
    fd1 = ld2 + ld3;
    ad1 = ad2 - ad3;
    for(int i0=0; i0<10; i0++){
        ad4 = fd0 - fd1;
        ld2 *= -1;
        ld3 = ad1 + ad2;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, lb1, ab1, ab2, ab3);
}
        double ld4 = 507.97773580075454;
if(ao4 != null){
          ao3 = ao4.m4(ld4, ld2, ld3, ad1, ab4, fb0, fb1, lb1);
}
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
          ao4 = fo0.m4(ad2, ad3, ad4, fd0);
}
}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd0 < fd1;
    Thought lo0 = Thought186.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    fb0 = !fb1;
    Thought lo1 = Thought234.getInstance();
    fb0 = fb1 || fb0;
    Thought lo2 = Thought13.getInstance(fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo3 = Thought296.getInstance(fd1, fd0, fd1, fd0);
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
    fb1 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    Output.points[2][1] += fd1;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    Output.points[2][2] += fd0;
    fb1 = fd1 < fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          lb0 = fo1.m2(fd1, fd0, fd1, fd0);
}
    boolean lb1 = true;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fd1 = fd0 + fd1;
    boolean lb2 = false;
    double ld3 = 700.9902408876591;
    ld3 = fd0 + fd1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    Thought lo1 = Thought140.getInstance();
    fd0 = fd1 + fd0;
    boolean lb2 = false;
    lb2 = !fb0;
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, lb2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb3, fb0, fb1, lb0);
}
    lb2 = fd1 > fd0;
    fd1 *= -1;
    lb3 = fd0 < fd1;
    fd0 *= -1;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
